package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.networks

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request = chain.request()
            .newBuilder()
            .url(originalRequest.url)
            .build()
        Log.d("Request", request.toString())
        val response = chain.proceed(request)

        Log.d("Response", response.code.toString())
        return response
    }
}