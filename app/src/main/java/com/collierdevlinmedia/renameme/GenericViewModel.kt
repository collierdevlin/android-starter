package com.collierdevlinmedia.renameme

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GenericViewModel: ViewModel() {

    private var _originalFileUri = MutableLiveData<Uri?>()
    var originalFileUri: LiveData<Uri?> = _originalFileUri

    fun getOriginalFileUri(): Uri? {
        return originalFileUri.value
    }

    fun setOriginalFileUri(uri: Uri?) {
        _originalFileUri.postValue(uri)
    }

    private var _convertedImageUri = MutableLiveData<Uri?>()
    var convertedImageUri: LiveData<Uri?> = _convertedImageUri

    fun setConvertedImageUri(uri: Uri?) {
        _convertedImageUri.postValue(uri)
    }

    private var _croppedImageUri = MutableLiveData<Uri?>()
    var croppedImageUri: LiveData<Uri?> = _croppedImageUri

    fun getCroppedImageUri(): Uri? {
        return croppedImageUri.value
    }

    fun setCroppedImageUri(uri: Uri?) {
        _croppedImageUri.postValue(uri)
    }

    fun reset() {
        setOriginalFileUri(null)
        setConvertedImageUri(null)
        setCroppedImageUri(null)
    }

}