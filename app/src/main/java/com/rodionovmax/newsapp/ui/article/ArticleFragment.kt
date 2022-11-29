package com.rodionovmax.newsapp.ui.article

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rodionovmax.newsapp.ui.NewsActivity
import com.rodionovmax.newsapp.ui.NewsViewModel

class ArticleFragment : Fragment() {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}