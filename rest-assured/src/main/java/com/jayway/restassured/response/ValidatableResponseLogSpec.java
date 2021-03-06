/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jayway.restassured.response;


import org.hamcrest.Matcher;

public interface ValidatableResponseLogSpec<T extends ValidatableResponseOptions<T, R>, R extends ResponseBody<R> & ResponseOptions<R>> {

    /**
     * Logs only the status line (includes the status code)
     *
     * @return The validatable response specification
     */
    T status();

    /**
     * Logs everything only if an error occurs (status code >= 400).
     *
     * @return The validatable response specification
     */
    T ifError();

    /**
     * Logs everything only if if the status code is equal to <code>statusCode</code>.
     *
     * @param statusCode The status code
     * @return The validatable response specification
     */
    T ifStatusCodeIsEqualTo(int statusCode);

    /**
     * Logs everything only if if the status code matches the supplied <code>matcher</code>
     *
     * @param matcher The hamcrest matcher
     * @return The validatable response specification
     */
    T ifStatusCodeMatches(Matcher<Integer> matcher);

    /**
     * Logs only the content of the body. The body will be pretty-printed by default if content-type is either XML, JSON or HTML.
     *
     * @return The specification
     */
    T body();

    /**
     * Logs only the content of the body and pretty-print the body if specified. Note that pretty-printing can only take place if the
     * content-type is either XML, JSON or HTML.
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T body(boolean shouldPrettyPrint);

    /**
     * Logs everything in the response, including e.g. headers, cookies, body.   Pretty-prints the body if content-type is either either XML, JSON or HTML..
     *
     * @return The specification
     */
    T all();

    /**
     * Logs everything in the response, including e.g. headers, cookies, body with the option to pretty-print the body if the content-type is
     * either XML, JSON or HTML..
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T all(boolean shouldPrettyPrint);

    /**
     * Logs everything in the response, including e.g. headers, cookies, body. Pretty-prints the body if content-type is either either XML, JSON or HTML..
     *
     * @return The specification
     */
    T everything();

    /**
     * * Logs everything in the response, including e.g. headers, cookies, body with the option to pretty-print the body if the content-type is
     * either XML, JSON or HTML..
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T everything(boolean shouldPrettyPrint);

    /**
     * Logs only the headers.
     *
     * @return The specification
     */
    T headers();

    /**
     * Logs only the cookies.
     *
     * @return The specification
     */
    T cookies();
}
