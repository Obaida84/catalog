package eu.epfc.java1888.catalog;

    class ProductNotFoundException extends RuntimeException {

        ProductNotFoundException(Long id) {
            super("Could not find product " + id);
        }
    }

