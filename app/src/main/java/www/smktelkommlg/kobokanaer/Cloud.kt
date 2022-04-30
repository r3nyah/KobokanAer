package www.smktelkommlg.kobokanaer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Cloud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud)

        val play = findViewById<ImageButton>(R.id.play)
        val pause = findViewById<ImageButton>(R.id.pause)
        var mantrahujan = findViewById<VideoView>(R.id.mantrahujan)
        //mantrahujan.setVideoPath("https://www.youtube.com/watch?v=SF-_47-oCtk")
        // val Uri = Uri.parse("https://www.youtube.com/watch?v=SF-_47-oCtk")
        val Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.mantrahujan)
        mantrahujan.setVideoURI(Uri)


        play.setOnClickListener{
            play.visibility = View.INVISIBLE
            pause.visibility = View.VISIBLE
            mantrahujan.visibility = View.VISIBLE
            mantrahujan.start()
        }
        pause.setOnClickListener{
            play.visibility = View.VISIBLE
            pause.visibility = View.INVISIBLE
            mantrahujan.visibility = View.INVISIBLE
            mantrahujan.stopPlayback()
        }
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
            }
            R.id.home -> {
                startActivity(moveHome)

            }

        }
    }
}