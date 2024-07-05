package com.app.baseapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.app.baseapp.adapter.ListAdapter
import com.app.baseapp.base.BaseFragment
import com.app.baseapp.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun setBinding() = FragmentMainBinding.inflate(layoutInflater)

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.appListRecyclerView.adapter = adapter
        adapter.setAdapterList(listOf("", "", "", "", "", "", "", "", ""))
    }

}