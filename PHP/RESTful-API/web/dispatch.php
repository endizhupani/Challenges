<?php

require_once '../vendor/autoload.php';

$app = new Tonic\Application(array(
    'load' => __DIR__ . '/../resources/*.php' //get all the resource files
));


$request = new Tonic\Request();

$resource = $app->getResource($request);
$response = $resource->exec();
$response->output();