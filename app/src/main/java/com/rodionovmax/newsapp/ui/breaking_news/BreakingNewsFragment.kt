package com.rodionovmax.newsapp.ui.breaking_news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rodionovmax.newsapp.ui.NewsActivity
import com.rodionovmax.newsapp.ui.NewsViewModel

class BreakingNewsFragment : Fragment() {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}