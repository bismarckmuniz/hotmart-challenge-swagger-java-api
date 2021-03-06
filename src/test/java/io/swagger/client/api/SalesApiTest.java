/*
 * hotmart-challenge
 * API Hotmart Challenge
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bismarck@ufmg.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorReturn;
import io.swagger.client.model.SalesManReturn;
import io.swagger.client.model.SalesReturn;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SalesApi
 */
@Ignore
public class SalesApiTest {

    private final SalesApi api = new SalesApi();

    
    /**
     * Deletar venda
     *
     * Deletar venda
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletarVendaTest() throws ApiException {
        Integer salesCode = null;
        api.deletarVenda(salesCode);

        // TODO: test validations
    }
    
    /**
     * Recupera a lista geral de vendas
     *
     * Recupera a lista de vendas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultarVendaTest() throws ApiException {
        SalesReturn response = api.getConsultarVenda();

        // TODO: test validations
    }
    
    /**
     * Buscar informações da lista de vendas por id
     *
     * Buscar informações da lista de vendas por id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultarVendasIdTest() throws ApiException {
        Integer idSalesman = null;
        SalesManReturn response = api.getConsultarVendasId(idSalesman);

        // TODO: test validations
    }
    
    /**
     * Salva a vendas
     *
     * Salva a vendas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCadastrarVendasTest() throws ApiException {
        String salesMan = null;
        String buyer = null;
        String product = null;
        api.postCadastrarVendas(salesMan, buyer, product);

        // TODO: test validations
    }
    
    /**
     * Alterar a lista de vendas
     *
     * Alterar a lista de vendas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAlterarVendasTest() throws ApiException {
        Integer salesCode = null;
        String product = null;
        api.putAlterarVendas(salesCode, product);

        // TODO: test validations
    }
    
}
