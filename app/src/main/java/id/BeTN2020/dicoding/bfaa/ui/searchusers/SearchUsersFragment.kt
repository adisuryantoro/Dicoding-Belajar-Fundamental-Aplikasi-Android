package id.BeTN2020.dicoding.bfaa.ui.searchusers

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.BeTN2020.dicoding.bfaa.R

class SearchUsersFragment : Fragment() {

    companion object {
        fun newInstance() = SearchUsersFragment()
    }

    private lateinit var viewModel: SearchUsersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_users_fragment, container, false)
    }

    @SuppressLint("ResourceAsColor")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchUsersViewModel::class.java)
//        (activity as MainActivity).setSupportActionBar(R.id.toolbar)
//        (activity as MainActivity?)?.supportActionBar?.setDisplayShowTitleEnabled(false)
//        toolbar.setTitleTextColor(Color.WHITE)
//        toolbar_title.text = getString(R.string.string_profile_title)
//        setHasOptionsMenu(true)
    }

}