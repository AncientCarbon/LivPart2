package com.example.livpart2.model.service.implementation

import com.example.livpart2.model.service.AccountService
import com.example.livpart2.model.service.StorageService
import com.example.livpart2.model.service.trace
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.snapshots
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.ktx.toObjects
import javax.inject.Inject
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.asDeferred
import kotlinx.coroutines.tasks.await

class StorageServiceImpl
@Inject
constructor(private val firestore: FirebaseFirestore, private val auth: AccountService) :
    StorageService {
    override suspend fun delete(userId: String) {
        currentCollection(auth.currentUserId).document(userId).delete().await()
    }
    private fun currentCollection(uid: String): CollectionReference =
        firestore.collection(USER_COLLECTION)

    companion object {
        private const val USER_COLLECTION = "users"
    }
}