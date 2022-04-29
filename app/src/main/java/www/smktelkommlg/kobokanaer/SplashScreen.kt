package www.smktelkommlg.kobokanaer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashScreen : AppCompatActivity() {
    private lateinit var videoView :VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        videoView=findViewById(R.id.videoView)
        val Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.opening)
        videoView.setVideoURI(Uri)
        videoView.start()
        val moveIntent = Intent(this, MainActivity::class.java)

        lifecycleScope.launch(Dispatchers.Default){
            try{
                for (i in 0..50){
                    delay(500)
                    val percentage = i*10

                    withContext(Dispatchers.Main){
                        if(percentage == 100){
                            startActivity(moveIntent)
                        }
                    }
                }
            }catch (e : Exception){
                e.printStackTrace()
            }
        }
    }


}