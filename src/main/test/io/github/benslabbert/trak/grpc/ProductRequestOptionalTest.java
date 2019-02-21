package io.github.benslabbert.trak.grpc;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ProductRequestOptionalTest {

  @Test
  public void getProductIdTest_empty() {

    ProductRequest request = ProductRequest.newBuilder().build();
    assertNotNull(request);

    Optional<Long> productId = ProductRequestOptional.getProductId(request);

    assertNotNull(productId);
    assertTrue(productId.isEmpty());
  }

  @Test
  public void getProductIdTest() {

    ProductRequest request = ProductRequest.newBuilder().setOptionalProductIdValue(1L).build();
    assertNotNull(request);

    Optional<Long> productId = ProductRequestOptional.getProductId(request);

    assertNotNull(productId);
    assertFalse(productId.isEmpty());
    assertEquals(1L, request.getOptionalProductIdValue());
  }

  @Test
  public void getBrandIdTest_empty() {

    ProductRequest request = ProductRequest.newBuilder().build();
    assertNotNull(request);

    Optional<Long> productId = ProductRequestOptional.getBrandId(request);

    assertNotNull(productId);
    assertTrue(productId.isEmpty());
  }

  @Test
  public void getBrandIdTest() {

    ProductRequest request = ProductRequest.newBuilder().setOptionalBrandIdValue(1L).build();
    assertNotNull(request);

    Optional<Long> productId = ProductRequestOptional.getBrandId(request);

    assertNotNull(productId);
    assertFalse(productId.isEmpty());
    assertEquals(1L, request.getOptionalBrandIdValue());
  }

  @Test
  public void getEmptyTest() {

    ProductRequest request = ProductRequest.newBuilder().build();
    assertNotNull(request);

    assertTrue(ProductRequestOptional.isEmpty(request.getOptionalProductIdCase()));
  }
}
