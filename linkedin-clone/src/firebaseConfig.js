// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import { getAuth } from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCEalC0WzYOuMBMhUzMBXRsHQq5S4XlXK4",
  authDomain: "linkedin-clone-144b4.firebaseapp.com",
  projectId: "linkedin-clone-144b4",
  storageBucket: "linkedin-clone-144b4.appspot.com",
  messagingSenderId: "689195023570",
  appId: "1:689195023570:web:e58111b8836b5e9b98810b",
  measurementId: "G-LRWB7XDS5F"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);

export { auth, app }