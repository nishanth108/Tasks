import React from 'react'
import { LoginAPi } from '../api/AuthApi'
import  '../Sass/LoginComponent.scss'


export default function LoginComponent() {

  const login = () => {
    let res = LoginAPi();
    console.log(res);
    
  };

  return (
    <div>
        <h2>Login Component</h2>
        <input className='common-input' placeholder='Enter your email' />
        <button onClick={login} className='login'>Login to linkedin</button>
    </div>
  )
}
