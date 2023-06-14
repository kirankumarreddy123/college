import { Link } from "react-router-dom";
import "./Message.css";
export function Message() {
    return (
        <div>
            <img src="./assets/Gates-Institute-logo.png" alt='...'id="I1"/>
    <div id="f1">
        <tr>
            <td>
                <Link to='/grievance'><button>GRIEVENCE FORM</button></Link>
            </td>
        </tr>
        
        <tr>
            <td>
            <Link to='/message'><button>MESSAGE BOX</button></Link>
            </td>
        </tr>
    </div>
    <div id="f3">
        <tr><td><b><h2>Welcome</h2></b><hr/></td></tr>
        <div id="request">
<h3>Sorry! For your Inconvinient...</h3>
<form>
<label for="">User Name:  </label>
<input type="text" id="name"/>
<br/>
<br/>
<label for="">Password:</label>
<input type="password" id="Password"/>
<br/>
<br/>
<label for="">Date of filling the form:</label>
<input type="date" id="dob"/>
<br/>
<br/>
<label for="">Email:</label>
<input type="email" id="email" required/>
<br/>
<p>The specific details of the complaint:</p>
<textarea>

</textarea>
<br/>
<br/>
<button type="submit">Send</button>
</form>
        </div>
    </div>
    {/* <Link to="/">Click to go to our Home</Link> */}
        </div>
    )
}