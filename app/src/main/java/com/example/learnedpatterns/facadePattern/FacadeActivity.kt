package com.example.learnedpatterns.facadePattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.learnedpatterns.databinding.ActivityFacadeBinding

class FacadeActivity : AppCompatActivity() {

    private val viewModel:FacadeViewModel by viewModels()
    private lateinit var binding: ActivityFacadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFacadeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getUserButton.setOnClickListener {
            val user = viewModel.getUser()
            Toast.makeText(this, "User ${user.name} ${user.lastName} from ${user.dataSource}", Toast.LENGTH_SHORT).show()
        }
    }
}