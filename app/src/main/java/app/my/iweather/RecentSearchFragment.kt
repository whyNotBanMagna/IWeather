package app.my.iweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecentSearchFragment : Fragment() {

    private lateinit var adapter : RecentSearchAdapter
    var OnItemClick:((position:Int)->Unit)? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recent_search, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        adapter = RecentSearchAdapter(SearchObj.data)
        recyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        recyclerView.adapter = adapter
        adapter.OnItemClick = {
            OnItemClick?.invoke(it)
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = RecentSearchFragment()
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }

}