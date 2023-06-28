package ru.steelwave.unotes.presentation.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.ModalMainMenuBinding

class CustomMenu(context: Context,
                 private val iconImageView: ImageView,
                 attrs: AttributeSet? = null,
                 defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var popupWindow: PopupWindow
    private var btnClose: ImageButton

    init {
        LayoutInflater.from(context).inflate(R.layout.modal_main_menu, this, true)
        btnClose = findViewById(R.id.btn_close_modal)

        btnClose.setOnClickListener {
            hideMenu()
        }

        popupWindow = PopupWindow(this, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        popupWindow.setOnDismissListener {
            iconImageView.setImageDrawable(resources.getDrawable(R.drawable.icon_open))
        }
        popupWindow.isOutsideTouchable = true

    }

    fun isShowing():Boolean{
        return popupWindow.isShowing
    }

    fun showMenu(anchorView: View) {
        popupWindow.showAsDropDown(anchorView)
    }

    fun hideMenu() {
        if (popupWindow.isShowing) {
            popupWindow.dismiss()
        }
    }

}