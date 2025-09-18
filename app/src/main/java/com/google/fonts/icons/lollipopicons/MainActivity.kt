package com.google.fonts.icons.lollipopicons

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.PathShape
import android.os.Bundle
import android.os.SystemClock
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat


class MainActivity : ComponentActivity() {
    fun addImage(parent: ViewGroup, drawable: Drawable) {
        val image = ImageView(this)
        image.setImageDrawable(drawable)
        parent.addView(image)
    }

    fun addText(parent: ViewGroup, s: String) {
        val tv = TextView(this)
        tv.text = s
        tv.textSize = 24f
        parent.addView(tv)
    }

    fun createSettingsPath(): ShapeDrawable {
        val path = Path()
        path.moveTo(9.25f, 22.0f)
        path.lineTo(8.85f, 18.8f)
        path.quadTo(8.525f, 18.675f, 8.2375f, 18.5f)
        path.quadTo(7.95f, 18.325f, 7.675f, 18.125f)
        path.lineTo(4.7f, 19.375f)
        path.lineTo(1.95f, 14.625f)
        path.lineTo(4.525f, 12.675f)
        path.quadTo(4.5f, 12.5f, 4.5f, 12.3375f)
        path.quadTo(4.5f, 12.175f, 4.5f, 12.0f)
        path.quadTo(4.5f, 11.825f, 4.5f, 11.6625f)
        path.quadTo(4.5f, 11.5f, 4.525f, 11.325f)
        path.lineTo(1.95f, 9.375f)
        path.lineTo(4.7f, 4.625f)
        path.lineTo(7.675f, 5.875f)
        path.quadTo(7.95f, 5.675f, 8.25f, 5.5f)
        path.quadTo(8.55f, 5.325f, 8.85f, 5.2f)
        path.lineTo(9.25f, 2.0f)
        path.lineTo(14.75f, 2.0f)
        path.lineTo(15.15f, 5.2f)
        path.quadTo(15.475f, 5.325f, 15.7625f, 5.5f)
        path.quadTo(16.05f, 5.675f, 16.325f, 5.875f)
        path.lineTo(19.3f, 4.625f)
        path.lineTo(22.05f, 9.375f)
        path.lineTo(19.475f, 11.325f)
        path.quadTo(19.5f, 11.5f, 19.5f, 11.6625f)
        path.quadTo(19.5f, 11.825f, 19.5f, 12.0f)
        path.quadTo(19.5f, 12.175f, 19.5f, 12.3375f)
        path.quadTo(19.5f, 12.5f, 19.45f, 12.675f)
        path.lineTo(22.025f, 14.625f)
        path.lineTo(19.275f, 19.375f)
        path.lineTo(16.325f, 18.125f)
        path.quadTo(16.05f, 18.325f, 15.75f, 18.5f)
        path.quadTo(15.45f, 18.675f, 15.15f, 18.8f)
        path.lineTo(14.75f, 22.0f)
        path.lineTo(9.25f, 22.0f)
        path.close()
        path.moveTo(11.0f, 20.0f)
        path.lineTo(12.975f, 20.0f)
        path.lineTo(13.325f, 17.35f)
        path.quadTo(14.1f, 17.15f, 14.7625f, 16.7625f)
        path.quadTo(15.425f, 16.375f, 15.975f, 15.825f)
        path.lineTo(18.45f, 16.85f)
        path.lineTo(19.425f, 15.15f)
        path.lineTo(17.275f, 13.525f)
        path.quadTo(17.4f, 13.175f, 17.45f, 12.7875f)
        path.quadTo(17.5f, 12.4f, 17.5f, 12.0f)
        path.quadTo(17.5f, 11.6f, 17.45f, 11.2125f)
        path.quadTo(17.4f, 10.825f, 17.275f, 10.475f)
        path.lineTo(19.425f, 8.85f)
        path.lineTo(18.45f, 7.15f)
        path.lineTo(15.975f, 8.2f)
        path.quadTo(15.425f, 7.625f, 14.7625f, 7.2375f)
        path.quadTo(14.1f, 6.85f, 13.325f, 6.65f)
        path.lineTo(13.0f, 4.0f)
        path.lineTo(11.025f, 4.0f)
        path.lineTo(10.675f, 6.65f)
        path.quadTo(9.9f, 6.85f, 9.2375f, 7.2375f)
        path.quadTo(8.575f, 7.625f, 8.025f, 8.175f)
        path.lineTo(5.55f, 7.15f)
        path.lineTo(4.575f, 8.85f)
        path.lineTo(6.725f, 10.45f)
        path.quadTo(6.6f, 10.825f, 6.55f, 11.2f)
        path.quadTo(6.5f, 11.575f, 6.5f, 12.0f)
        path.quadTo(6.5f, 12.4f, 6.55f, 12.775f)
        path.quadTo(6.6f, 13.15f, 6.725f, 13.525f)
        path.lineTo(4.575f, 15.15f)
        path.lineTo(5.55f, 16.85f)
        path.lineTo(8.025f, 15.8f)
        path.quadTo(8.575f, 16.375f, 9.2375f, 16.7625f)
        path.quadTo(9.9f, 17.15f, 10.675f, 17.35f)
        path.lineTo(11.0f, 20.0f)
        path.close()
        path.moveTo(12.05f, 15.5f)
        path.quadTo(13.5f, 15.5f, 14.525f, 14.475f)
        path.quadTo(15.55f, 13.45f, 15.55f, 12.0f)
        path.quadTo(15.55f, 10.55f, 14.525f, 9.525f)
        path.quadTo(13.5f, 8.5f, 12.05f, 8.5f)
        path.quadTo(10.575f, 8.5f, 9.5625f, 9.525f)
        path.quadTo(8.55f, 10.55f, 8.55f, 12.0f)
        path.quadTo(8.55f, 13.45f, 9.5625f, 14.475f)
        path.quadTo(10.575f, 15.5f, 12.05f, 15.5f)
        path.close()
        path.moveTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.quadTo(12.0f, 12.0f, 12.0f, 12.0f)
        path.lineTo(12.0f, 12.0f)
        path.close()



        path.fillType = Path.FillType.WINDING

        val ps = PathShape(path, 24f, 24f)
        val sd = ShapeDrawable(ps)

        sd.paint.color = Color.BLUE
        sd.paint.style = Paint.Style.FILL

        val metrics = this.resources.displayMetrics
        val dimPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 64f, metrics).toInt()

        sd.intrinsicWidth = dimPx
        sd.intrinsicHeight = dimPx
        return sd
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            orientation = LinearLayout.VERTICAL
        }

        // "Traditional" vector drawable
        var vdt = SystemClock.elapsedRealtimeNanos()
        val vd = ContextCompat.getDrawable(this, R.drawable.settings_24px)!!
        vdt = SystemClock.elapsedRealtimeNanos() - vdt
        addImage(layout, vd);
        addText(layout, String.format("VectorDrawable %.2fms", vdt / 1000_000.0))

        // PathShape
        var pt = SystemClock.elapsedRealtimeNanos()
        val path = createSettingsPath();
        pt = SystemClock.elapsedRealtimeNanos() - pt
        addImage(layout, path);
        addText(layout, String.format("Path %.2fms", pt / 1000_000.0))

        setContentView(layout)
    }
}
