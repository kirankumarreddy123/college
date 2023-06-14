import { Link } from "react-router-dom";
import './Login.css';

export function Login() {
    return (
        <div>
        <img src="./assets/Gates-Institute-logo.png" alt='...' id="I1"/>
    <section id="forms">
        <div className="box">
         <h2>Student Login</h2>
            <article>
                <label>Username: <input type="text" required/></label>
                <br/>
                <label>Password : <input type="password" required/></label>
                <br/>
                <Link to="/grievance"><button type="submit">Login</button></Link>
            </article>
         </div>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <div className="circle">
             <h2>Admin Login</h2>
            <article>
                <label>Username: <input type="text" required/></label> 
                <br/>
                <label>Password : <input type="password" required/></label>
                <br/>
                <Link to="/admin"><button type="submit">Login</button></Link>
            </article>
         </div>
    </section>
    {/* <Link to="/">Click to go to our Home</Link> */}
    </div>
    )
}