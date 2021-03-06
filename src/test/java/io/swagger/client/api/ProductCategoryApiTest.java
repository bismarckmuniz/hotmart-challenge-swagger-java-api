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
import io.swagger.client.model.CategoryReturn;
import io.swagger.client.model.ErrorReturn;
import io.swagger.client.model.ProductCategoryReturn;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductCategoryApi
 */
@Ignore
public class ProductCategoryApiTest {

    private final ProductCategoryApi api = new ProductCategoryApi();

    
    /**
     * Deletar categoria produto
     *
     * Deletar categoria produto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletarProductCategoryTest() throws ApiException {
        Integer productCategoryCode = null;
        api.deletarProductCategory(productCategoryCode);

        // TODO: test validations
    }
    
    /**
     * Recupera a lista geral de categoria de produtos
     *
     * Recupera a lista de categoria de produtos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultarCategoriaTest() throws ApiException {
        CategoryReturn response = api.getConsultarCategoria();

        // TODO: test validations
    }
    
    /**
     * Buscar informações de produtos por id
     *
     * Buscar informações de produtos por id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsultarCategoriaProdutoIdTest() throws ApiException {
        Integer idCategoriaProduto = null;
        ProductCategoryReturn response = api.getConsultarCategoriaProdutoId(idCategoriaProduto);

        // TODO: test validations
    }
    
    /**
     * Cadastro de categoria de produtos
     *
     * Cadastro de categoria produto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCadastrarCategoriaTest() throws ApiException {
        Integer productCategoryCode = null;
        String product = null;
        api.postCadastrarCategoria(productCategoryCode, product);

        // TODO: test validations
    }
    
    /**
     * Alterar categoria produto
     *
     * Alterar categoria produto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAlterarCategoriaProdutoTest() throws ApiException {
        Integer productCategoryCode = null;
        String product = null;
        api.putAlterarCategoriaProduto(productCategoryCode, product);

        // TODO: test validations
    }
    
}
