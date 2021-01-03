package com.example.pjt1

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    companion object{
        const val TAG:String ="로그"
        fun newInstance():ProfileFragment{
            return ProfileFragment()
        }
    }
    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"ProfileFragment -onCreate() called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"ProfileFragment -onAttach() called")
    }

    // 뷰가 생성되었을때
    // 프레그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"ProfileFragment -onCreateView() called")
        val context = context as MainActivity
        var items = mutableListOf<ListViewitem>()
        items.add(ListViewitem("입출금통장","까다로운 계좌개설도 손쉽게","연 0.10%"))
        items.add(ListViewitem("모임통장","함께쓰고 같이봐요","연 0.10%"))
        items.add(ListViewitem("세이프박스","여유자금을 따로 보관하세요","연 0.50%"))
        items.add(ListViewitem("저금통","매일매일 조금씩 쌓여요","연 2.00%"))
        items.add(ListViewitem("정기예금","실시간 이자가 쌓여요","연 1.00%"))
        items.add(ListViewitem("자유적금","매일/매주/매월/26주 자유롭게","연 1.30%"))

        val view = inflater.inflate(R.layout.fragment_profile,container,false)
        val deposit_list:ListView = view.findViewById(R.id.Deposit_list)
        deposit_list.adapter = ListViewAdapter(items)
        return view
    }

}