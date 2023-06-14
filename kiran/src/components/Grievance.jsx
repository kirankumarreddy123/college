import { Link } from "react-router-dom";
import "./Grievance.css";
export function Grievance() {
    return (
        <div>

<img src="./assets/Gates-Institute-logo.png" alt='...'/>
  
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
  <div id="f2">
      <tr><td><b><h2>GRIEVENCE FORM</h2></b><hr/></td></tr>
      <div id="complaints">
          <form action="../4.html">
              <span><label>Roll-NO :  </label></span>
              <span><input type="text" id="enrollment"/></span>
              <br/>
              <label for=""> DEPARTMENT :    </label>
                  <select name= "department"  id="department">
                      
                      <option value=" ">(select one)</option>
                      <option value="1">CSE</option>
                      <option value="2">ECE</option>
                      <option value="3">EEE</option>
                      <option value="4">MECH</option>
                      <option value="5">CIVIL</option>
                      <option value="6">CDS</option>
                      <option value="7">CAI</option>
                      <option value="8">CCS</option>
                  </select>
             
              <legend>Gender : 
              
                      <label>Male<input id="male" type="radio" name="gender" />Female<input id="female" type="radio" name="gender" /></label>
                  
              </legend>
              <label for="email">Email: </label>
              <input type="email" id="text" minlength="10" required/>
              <br/>
              <label for=" "> GRIVANCE CATEGORY  : <select id="category" name="category">
                  <option value=" ">(select one)</option>
                  <option value="1">EXAMINATION</option>
                  <option value="2">INFRASTRUCTURE</option>
                  <option value="3">GENERAL FACILITIES</option>
                  <option value="4">HOSTEL</option>
                  <option value="5">LIBRARY</option>
                  <option value="6">SPORTS</option>
                  <option value="7">HYGIENE</option>
                  <option value="8">ADMISSION</option>
                  <option value="9">SEXUAL HARASSMENT</option>
                  <option value="10">TEACHING LEARNING</option>
                  <option value="11">ANY OTHER</option>
               </select>
              </label>
              <br/>
              <label for="grievance description">GRIEVANCE DESCRIPTION : </label>
              <input type="text" id="grievance description" placeholder="MAXIMUM 150 WORDS"/>
          <p> I hereby declare that the information provided above is correct.I shall be responsible for furnishing any wrong information.</p>
          <label for="Declaration"> Declaration : </label>
          <label>Accept <input type="checkbox" id="accept"/></label><br/>
          <button type="Submit">Submit Grievance</button>
              
          </form>
      </div>
  </div>
  {/* <Link to="/">Click to go to our Home</Link> */}
        </div>
    )
}