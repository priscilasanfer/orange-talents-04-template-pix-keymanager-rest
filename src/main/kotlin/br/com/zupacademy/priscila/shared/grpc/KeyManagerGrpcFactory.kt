package br.com.zupacademy.priscila.shared.grpc

import br.com.zupacademy.priscila.KeyManagerDeletaServiceGrpc
import br.com.zupacademy.priscila.KeyManagerRegistraServiceGrpc
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class KeyManagerGrpcFactory(@GrpcChannel("KeyManager") val channel: ManagedChannel) {

    @Singleton
    fun registraChave() = KeyManagerRegistraServiceGrpc.newBlockingStub(channel)

    @Singleton
    fun deletaChave() = KeyManagerDeletaServiceGrpc.newBlockingStub(channel)
}