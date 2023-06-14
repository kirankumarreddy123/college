import { Link } from "react-router-dom";
import"./Registration.css";
export function Registration() {
    return (
        <div>
             <img src="./assets/Gates-Institute-logo.png" alt='...' id="I1"/>
            <h1 id="r1">REGISTRATION FORM</h1>
    <form>
        <table>
            <tr><td>First Name:</td>
                <td><input type="text" placeholder="First Name" First Name="" required/></td>
            </tr>
            <tr><td>Last Name:</td>
                <td><input type="text" placeholder="Last Name" Last Name="" required/></td>
            </tr>
            <tr><td>Roll_NO:</td>
                <td><input type="text" placeholder="Roll_no" Roll_no="" required/></td>
            </tr>
            <tr><td>User</td>
                <td><select>
                    <option>Select One</option>
                    <option>Admin</option>
                    <option>Student</option></select></td>
            </tr>
            <tr><td>Date Of Birth:</td>
                    <td><input type="date"/></td>
            </tr>
            <tr><td>Department:</td>
                <td>
                    <select>
                        <option>Select One</option>
                        <option>CSE</option>
                        <option>CSE-AI</option>
                        <option>CSE-DS</option>
                        <option>ECE</option>
                        <option>EEE</option>
                        <option>CIVIL</option>
                        <option>MECH</option>
                        <option>MBA</option>
                        <option>MCA</option>
                    </select>
                </td>
            </tr>   
            <tr><td>Phone Number:</td>
                <td><input type="Number" placeholder="Number" number="" required/></td>
            </tr>
            <tr><td>Email Id:</td>
                <td><input type="email" placeholder="email" required/></td>
            </tr>
            <tr><td>Password:</td>
                <td><input type="Password" placeholder="Password" required/></td>
            </tr>
            <tr><td>Confirm Password:</td>
                <td><input type="password" placeholder="Password"/></td>
            </tr>
            <tr><td>Gender:</td>
                <td>
                    <input type="radio" name="gender"/>Male
                    <input type="radio" name="gender"/>Female
                </td>
            </tr>
            <td><Link to="/Login"><button type="Submit">Submit</button></Link></td>
        </table>
    </form>
    {/* <Link to='/'>Click to go to our Home</Link> */}
        </div>
    )
}