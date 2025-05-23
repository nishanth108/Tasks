import React from 'react'
import ReactDOM from 'react-dom/client'
import { router } from './Routes/index.jsx'
import { app } from "./firebaseConfig.js"
import './index.css'
import { RouterProvider } from 'react-router-dom'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
)
