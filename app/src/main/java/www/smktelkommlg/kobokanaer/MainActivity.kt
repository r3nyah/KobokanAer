package www.smktelkommlg.kobokanaer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton1 = findViewById<Button>(R.id.button1)
        val mButton2 = findViewById<Button>(R.id.button2)

        val mButton3 = findViewById<Button>(R.id.button3)
        val mButton4 = findViewById<Button>(R.id.button4)

        val mButton5 = findViewById<Button>(R.id.button5)
        val mButton6 = findViewById<Button>(R.id.button6)

        val mButton7 = findViewById<Button>(R.id.button7)
        val mButton8 = findViewById<Button>(R.id.button8)
        val mButton9 = findViewById<Button>(R.id.button9)

        var temp = false
        mButton1.setOnClickListener {
            if(!temp){
                mButton2.visibility = View.INVISIBLE
                mButton3.visibility = View.INVISIBLE
                mButton4.visibility = View.INVISIBLE
                mButton5.visibility = View.INVISIBLE
                mButton6.visibility = View.INVISIBLE
                mButton7.visibility = View.INVISIBLE
                mButton8.visibility = View.INVISIBLE
                mButton9.visibility = View.INVISIBLE
            } else {
                mButton2.visibility = View.VISIBLE
                mButton3.visibility = View.VISIBLE
                mButton4.visibility = View.VISIBLE
                mButton5.visibility = View.VISIBLE
                mButton6.visibility = View.VISIBLE
                mButton7.visibility = View.VISIBLE
                mButton8.visibility = View.VISIBLE
                mButton9.visibility = View.VISIBLE

            }
            temp = !temp
        }
    }
}