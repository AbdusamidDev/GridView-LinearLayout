package developer.abdusamid.homework31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdusamid.homework31.adapders.UserAdapter
import developer.abdusamid.homework31.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<User>
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        loadData()

        userAdapter = UserAdapter(list)
        rv.adapter = userAdapter
    }

    private fun loadData() {
        list = ArrayList()
        list.add(User(R.drawable.google_logo, "Google"))
        list.add(User(R.drawable.microsoft_logo, "Microsoft"))
        list.add(User(R.drawable.facebook_logo, "FaceBook"))
        list.add(User(R.drawable.guthub_logo, "GitHub"))
        list.add(User(R.drawable.twitter_logo, "Twitter"))
        list.add(User(R.drawable.apple_logo, "Apple"))
    }
}