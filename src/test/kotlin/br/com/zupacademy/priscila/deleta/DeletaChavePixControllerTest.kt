package br.com.zupacademy.priscila.deleta

import br.com.zupacademy.priscila.DeletaChavePixResponse
import br.com.zupacademy.priscila.KeyManagerDeletaServiceGrpc.KeyManagerDeletaServiceBlockingStub
import br.com.zupacademy.priscila.shared.grpc.KeyManagerGrpcFactory
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Replaces
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito.any
import org.mockito.Mockito.mock
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@MicronautTest
internal class DeletaChavePixControllerTest {


    @field:Inject
    lateinit var removeStub: KeyManagerDeletaServiceBlockingStub

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    internal fun `deve remover uma chave pix existente`() {

        val clientId = UUID.randomUUID().toString()
        val pixId = UUID.randomUUID().toString()

        val respostaGrpc = DeletaChavePixResponse.newBuilder()
            .setClientId(clientId)
            .setPixId(pixId)
            .build()
        given(removeStub.deleta(any())).willReturn(respostaGrpc)


        val request = HttpRequest.DELETE<Any>("/api/v1/clientes/$clientId/pix/$pixId")
        val response = client.toBlocking().exchange(request, Any::class.java)

        assertEquals(HttpStatus.OK, response.status)
    }

    @Factory
    @Replaces(factory = KeyManagerGrpcFactory::class)
    internal class RemoveStubFactory {

        @Singleton
        fun deletaChave() = mock(KeyManagerDeletaServiceBlockingStub::class.java)
    }

}