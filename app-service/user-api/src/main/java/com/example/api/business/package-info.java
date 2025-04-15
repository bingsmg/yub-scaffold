/**
 * @author weibb
 */
package com.example.api.business;

class Info {
    public static final String NAME = "user-service";
    public static final String URL = "${scaffold.url." + NAME + ":" + NAME + "}";
    public static final String JAX_RS_PATH = NAME;
    public static final String CONTEXT_ID = "${scaffold.feign-context-id.user-service:jaxrs}";
}