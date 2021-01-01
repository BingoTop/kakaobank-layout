package com.example.pjt1

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class RankingFragment : Fragment() {
    companion object{
        const val TAG:String ="로그"
        fun newInstance():RankingFragment{
            return RankingFragment()
        }
    }
    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"RankingFragment -onCreate() called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"RankingFragment -onAttach() called")
    }

    // 뷰가 생성되었을때
    // 프레그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"RankingFragment -onCreateView() called")
        val view = inflater.inflate(R.layout.fragment_ranking,container,false)
        val context = context as MainActivity
        var items = mutableListOf<NotifyViewitem>()
        items.add(NotifyViewitem(ContextCompat.getDrawable(
            context,R.drawable.letterpaper)!!,"신용정보 변동 안내",
            "신용정보에 변동내역이 있습니다.\n 신용카드 및 체크 카드 등록정보를 확인해보세요.",
            "2020년 12월 23일"))
        val notify_list: ListView = view.findViewById(R.id.notify_list)
        notify_list.adapter = NotifyAdapter(items)
        return view
    }

}