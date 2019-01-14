package com.example.joe.nytchallenge.ui.home

import android.util.Log
import com.example.joe.nytchallenge.base.BaseViewModel
import com.example.joe.nytchallenge.models.ApiResponse
import com.example.joe.nytchallenge.netService.NetworkService
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ItemListViewModel: BaseViewModel() {

    @Inject
    lateinit var networkService: NetworkService

    lateinit var subscriptions:Disposable


    fun getSearch(article: String){
        subscriptions = networkService.getSearch(article)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { t1: ApiResponse?, t2: Throwable? ->
                for (i in 0 until t1?.response?.docs!!.size){
                    Log.d("Tag", "${t1?.response?.docs?.get(0)?.headline.toString()}")
                }
                t2?.printStackTrace()
            }
    }

    override fun onCleared() {
        super.onCleared()
        subscriptions.dispose()
    }
}