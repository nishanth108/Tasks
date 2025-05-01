import { signInWithEmailAndPassword, getAuth} from 'firebase/auth'
import { auth } from '../firebaseConfig';
 
export const LoginAPi = (email, password) => {
    
    signInWithEmailAndPassword(auth, email, password)      
};

