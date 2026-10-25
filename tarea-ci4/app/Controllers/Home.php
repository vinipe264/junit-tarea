<?php

namespace App\Controllers;

class Home extends BaseController
{
    public function index(): string
    {
        $data = [
            'titulo'  => 'Hola mundo utilizando CodeIgniter4 Framework',
            'mensaje' => 'Hola mundo',
        ];

        return view('home', $data);
    }
}
