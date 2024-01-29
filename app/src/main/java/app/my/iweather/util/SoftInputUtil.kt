package app.my.iweather.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

object SoftInputUtil {

    /**
     * 隐藏键盘，不知道键盘焦点在哪个view上
     *
     * @param activity
     */
    fun hideSoftInputView(activity: Activity) {
        hideSoftInputView(activity.currentFocus)
    }

    /**
     * 隐藏focusView上的键盘
     *
     * @param focusView 获取键盘焦点的view
     */
    fun hideSoftInputView(focusView: View?) {
        if (focusView != null) {
            val manager =
                focusView.context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            manager.hideSoftInputFromWindow(focusView.windowToken, 0)
        }
    }

    /**
     * 根据focusView弹出键盘
     *
     * @param focusView
     */
    fun showSoftInputView(focusView: View?) {
        if (focusView != null) {
            val manager =
                focusView.context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            manager.showSoftInput(focusView, 0)
        }
    }


    /**
     * 判断软键盘是否弹出
     */
    fun isShowKeyboard(context: Context, v: View): Boolean {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        return if (imm.hideSoftInputFromWindow(v.windowToken, 0)) {
            imm.showSoftInput(v, 0)
            true
        } else {
            false
        }
    }


    /**
     * 打开软键盘
     *
     * @param mEditText 输入框
     * @param mContext  上下文
     */
    fun openKeybord(mEditText: EditText, mContext: Context) {
        mEditText.isFocusable = true
        mEditText.requestFocus()
        val imm = mContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(mEditText, InputMethodManager.RESULT_SHOWN)
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }

    /**
     * 关闭软键盘
     *
     * @param mEditText 输入框
     * @param mContext  上下文
     */
    fun closeKeybord(mEditText: EditText, mContext: Context) {
        val imm = mContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(mEditText.windowToken, 0)
    }

}