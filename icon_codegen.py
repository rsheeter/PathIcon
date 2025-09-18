"""Generates Kotlin Path definition of an icon path

Usage:

python icon_codegen.py M370,880L354,752...Z
"""

import re
import sys


def float_coords(it):
	raw_coords = next(it)
	coords = ", ".join(str(float(c) / 40) + "f" for c in re.split(r"[, ]", raw_coords))
	return coords


def to_java_path(svg_path):
	# no spline commands (S, T) and no ellipses (A)
	raw_commands = re.split("([MmLlHhVvQqCcZz])", svg_path)
	raw_commands = [c.strip() for c in raw_commands if c.strip()]
	it = iter(raw_commands)
	path_cmds = ["val path = Path()"]
	while (cmd := next(it, None)) is not None:
		# TODO: relative
		match cmd:
			case "M":
				path_cmds.append(f"path.moveTo({float_coords(it)})")
			case "L":
				path_cmds.append(f"path.lineTo({float_coords(it)})")
			case "Q":
				path_cmds.append(f"path.quadTo({float_coords(it)})")
			case "C":
				path_cmds.append(f"path.cubicTo({float_coords(it)})")
			case "Z":
				path_cmds.append("path.close()")
			case _: raise ValueError(f"Unrecognized '{cmd}'")	
	return "\n".join(path_cmds)



def main():
	for svg_path in sys.argv[1:]:
		print(to_java_path(svg_path))



if __name__ == "__main__":
	main()