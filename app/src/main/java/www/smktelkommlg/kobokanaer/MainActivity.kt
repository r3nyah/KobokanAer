package www.smktelkommlg.kobokanaer

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import www.smktelkommlg.kobokanaer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var mediaWind: MediaPlayer
    private lateinit var binding : ActivityMainBinding
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

        val meatball = findViewById<ImageButton>(R.id.meatball)
        val matcha = findViewById<ImageButton>(R.id.matcha)
        val ghost = findViewById<ImageButton>(R.id.ghost)
        val basketball = findViewById<ImageButton>(R.id.basketball)
        val cloud = findViewById<ImageButton>(R.id.cloudd)
        val music = findViewById<ImageButton>(R.id.music)

        meatball.setOnClickListener(this)
        matcha.setOnClickListener(this)
        ghost.setOnClickListener(this)
        basketball.setOnClickListener(this)
        cloud.setOnClickListener(this)
        music.setOnClickListener(this)

        mediaPlayer = MediaPlayer.create(this,R.raw.kobok)
        mediaWind = MediaPlayer.create(this,R.raw.wind)
        mediaPlayer.start()


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
                mediaWind.start()
            } else {
                mButton2.visibility = View.VISIBLE
                mButton3.visibility = View.VISIBLE
                mButton4.visibility = View.VISIBLE
                mButton5.visibility = View.VISIBLE
                mButton6.visibility = View.VISIBLE
                mButton7.visibility = View.VISIBLE
                mButton8.visibility = View.VISIBLE
                mButton9.visibility = View.VISIBLE
                mediaWind.start()
            }
            temp = !temp
        }
    }

    override fun onBackPressed(){
        finishAffinity()
        mediaPlayer.stop()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        val moveHome = Intent(this, MainActivity::class.java)
        val moveCloud = Intent(this,Cloud::class.java)
        when (selectedMode) {
            R.id.cloud -> {
                startActivity(moveCloud)
                mediaPlayer.stop()
            }
            R.id.home -> {
                startActivity(moveHome)
                mediaPlayer.stop()
            }

        }
    }
}

private fun ImageButton.setOnClickListener(mainActivity: MainActivity) {

}
