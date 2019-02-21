package io.github.benslabbert.trak.grpc;

import java.util.Optional;

import static io.github.benslabbert.trak.grpc.ProductRequest.OptionalProductIdCase.*;

public class ProductRequestOptional {

  private ProductRequestOptional() {}

  public static Optional<Long> getProductId(ProductRequest request) {

    if (isProductId(request)) {
      return Optional.of(request.getOptionalProductIdValue());
    } else {
      return Optional.empty();
    }
  }

  public static Optional<Long> getBrandId(ProductRequest request) {

    if (isBrandId(request)) {
      return Optional.of(request.getOptionalProductIdValue());
    } else {
      return Optional.empty();
    }
  }

  public static boolean isProductId(ProductRequest request) {
    return request.getOptionalProductIdCase().equals(OPTIONAL_PRODUCTID_VALUE);
  }

  public static boolean isBrandId(ProductRequest request) {
    return request.getOptionalProductIdCase().equals(OPTIONAL_BRANDID_VALUE);
  }

  public static boolean isEmpty(ProductRequest.OptionalProductIdCase optionalProductIdCase) {
    return optionalProductIdCase.equals(OPTIONALPRODUCTID_NOT_SET);
  }
}
