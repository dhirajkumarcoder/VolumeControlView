package com.agilie.volumecontrol.animation.painter

import android.graphics.Canvas

interface Painter {

    fun onDraw(canvas: Canvas)
    fun onSizeChanged(w: Int, h: Int)

}