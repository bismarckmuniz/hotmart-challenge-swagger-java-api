# swagger-java-client

hotmart-challenge
- API version: 1.0.0
  - Build date: 2020-09-22T11:27:03.523Z

API Hotmart Challenge

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BuyerApi;

import java.io.File;
import java.util.*;

public class BuyerApiExample {

    public static void main(String[] args) {
        
        BuyerApi apiInstance = new BuyerApi();
        Integer buyerCode = 56; // Integer | Código do comprador
        try {
            apiInstance.deletarComprador(buyerCode);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuyerApi#deletarComprador");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.hotmart.com.br/v1/hotmart-challenge*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BuyerApi* | [**deletarComprador**](docs/BuyerApi.md#deletarComprador) | **DELETE** /Buyer | Deletar comprador
*BuyerApi* | [**getConsultarCommprador**](docs/BuyerApi.md#getConsultarCommprador) | **GET** /Buyer | Recupera a lista geral de comprador
*BuyerApi* | [**getConsultarCompradorId**](docs/BuyerApi.md#getConsultarCompradorId) | **GET** /Buyer/{buyerCode} | Buscar informações do comprador especifico por id
*BuyerApi* | [**postCadastrarComprador**](docs/BuyerApi.md#postCadastrarComprador) | **POST** /Buyer | Cadastro de comprador
*BuyerApi* | [**putAlterarComprador**](docs/BuyerApi.md#putAlterarComprador) | **PUT** /Buyer | Alterar cadastro do comprador
*ProductApi* | [**deletarProduto**](docs/ProductApi.md#deletarProduto) | **DELETE** /Product | Deletar produto
*ProductApi* | [**getConsultarProdutoId**](docs/ProductApi.md#getConsultarProdutoId) | **GET** /Product/{idProduct} | Buscar informações de produtos por Id
*ProductApi* | [**getConsultarProdutos**](docs/ProductApi.md#getConsultarProdutos) | **GET** /Product | Recupera a lista geral de produtos
*ProductApi* | [**postCadastrarProduto**](docs/ProductApi.md#postCadastrarProduto) | **POST** /Product | Faz cadastro de produto
*ProductApi* | [**putAlterarProduto**](docs/ProductApi.md#putAlterarProduto) | **PUT** /Product | Alterar cadastro de um produto
*ProductCategoryApi* | [**deletarProductCategory**](docs/ProductCategoryApi.md#deletarProductCategory) | **DELETE** /ProductCategory | Deletar categoria produto
*ProductCategoryApi* | [**getConsultarCategoria**](docs/ProductCategoryApi.md#getConsultarCategoria) | **GET** /ProductCategory | Recupera a lista geral de categoria de produtos
*ProductCategoryApi* | [**getConsultarCategoriaProdutoId**](docs/ProductCategoryApi.md#getConsultarCategoriaProdutoId) | **GET** /ProductCategory/{IdCategoriaProduto} | Buscar informações de produtos por id
*ProductCategoryApi* | [**postCadastrarCategoria**](docs/ProductCategoryApi.md#postCadastrarCategoria) | **POST** /ProductCategory | Cadastro de categoria de produtos
*ProductCategoryApi* | [**putAlterarCategoriaProduto**](docs/ProductCategoryApi.md#putAlterarCategoriaProduto) | **PUT** /ProductCategory | Alterar categoria produto
*SalesApi* | [**deletarVenda**](docs/SalesApi.md#deletarVenda) | **DELETE** /Sales | Deletar venda
*SalesApi* | [**getConsultarVenda**](docs/SalesApi.md#getConsultarVenda) | **GET** /Sales | Recupera a lista geral de vendas
*SalesApi* | [**getConsultarVendasId**](docs/SalesApi.md#getConsultarVendasId) | **GET** /Sales/{IdSalesman} | Buscar informações da lista de vendas por id
*SalesApi* | [**postCadastrarVendas**](docs/SalesApi.md#postCadastrarVendas) | **POST** /Sales | Salva a vendas
*SalesApi* | [**putAlterarVendas**](docs/SalesApi.md#putAlterarVendas) | **PUT** /Sales | Alterar a lista de vendas
*SalesmanApi* | [**deletarVendedor**](docs/SalesmanApi.md#deletarVendedor) | **DELETE** /Salesman | Deletar cadastro de vendedor
*SalesmanApi* | [**getConsultarVendedor**](docs/SalesmanApi.md#getConsultarVendedor) | **GET** /Salesman | Recupera a lista geral de vendedores
*SalesmanApi* | [**getConsultarVendedorId**](docs/SalesmanApi.md#getConsultarVendedorId) | **GET** /Salesman/{IdSalesMan} | Buscar informações cadastro de vendedor por id
*SalesmanApi* | [**postCadastrarVendedor**](docs/SalesmanApi.md#postCadastrarVendedor) | **POST** /Salesman | Salvar cadastro de vendedor
*SalesmanApi* | [**putAlterarVendedor**](docs/SalesmanApi.md#putAlterarVendedor) | **PUT** /Salesman | Alterar o cadastro de vendedor


## Documentation for Models

 - [BuyerReturn](docs/BuyerReturn.md)
 - [CategoryReturn](docs/CategoryReturn.md)
 - [Error](docs/Error.md)
 - [ErrorReturn](docs/ErrorReturn.md)
 - [ProductCategoryReturn](docs/ProductCategoryReturn.md)
 - [ProductReturn](docs/ProductReturn.md)
 - [SalesManReturn](docs/SalesManReturn.md)
 - [SalesReturn](docs/SalesReturn.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

bismarck@ufmg.br

