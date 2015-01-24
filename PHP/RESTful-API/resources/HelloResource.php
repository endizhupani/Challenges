<?php

/**
 *
 * @uri /hello
 * @uri /hello/{id}
 */
class HelloResource extends \Tonic\Resource {


    /**
     * @method GET
     */
    public function get($id) {
        return ($id != null) ? $id : 0;
    }

} 