package com.example.homework6month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {
    private var arrayList = arrayListOf<Animal>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view)
        arrayList.add(Animal("Zebra", age = 11))
        arrayList.add(Animal("Panda", age = 5))
        arrayList.add(Animal("Tiger", age = 7))
        arrayList.add(Animal("Crocodile", age = 22))
        arrayList.add(Animal("Monkey", age = 3))
        arrayList.add(Animal("Cat", age = 1))
        arrayList.add(Animal("Wolf", age = 6))
        arrayList.add(Animal("Mouse", age = 9))
        arrayList.add(Animal("Owl", age = 2))
        arrayList.add(Animal("Lion", age = 16))
        val adapter = AnimalAdapter(arrayList,object : OnItemClick{

            override fun onClick(animal: Animal) {
                Toast.makeText(requireContext(), "Name:" +animal.name + " age:"+animal.age , Toast.LENGTH_SHORT).show()
            }


        })
        recyclerView.adapter = adapter

    }

}