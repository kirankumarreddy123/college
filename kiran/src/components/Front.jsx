import { Link } from "react-router-dom";
import "./Front.css";

export function Front() {
    return(
        <div>
            <div id="d1">
	    <img src="./assets/Gates-Institute-logo.png" alt=".." width={900}/></div>
        <div className="rigister" id="d4">
        <Link to="/login"><img src="./assets/log.jpg" width="70px" height="55px" alt="..."/></Link>
          <Link to="/register"><img src="./assets/regis 1.jpg" width="70px" height="50px" alt="..."/></Link>
          {/* <Link to='grievance'><img src="./assets/grv.png" width="60px" height="50px" alt="..."/></Link> */}
          </div>
    <div className="college" id="d2" >
      <img src="./assets/GATES-main-Building-1.jpg" alt="..." width="1690px"height={474}/>
    </div>
    
 <div className="contacts" id="d3">
     <h4 id="con">contact Us</h4>
    <h4>&nbsp;&nbsp;<img src="./assets/maps-and-flags.png" width="15px" height="15px" alt="..."/> &nbsp;NH-44,Gootyananthapuram(village),<br/>&nbsp;&nbsp;&nbsp;Gooty-Anantapuram(District),Andhra Pradesh,India</h4>
     <h4>&nbsp;&nbsp;<img src="./assets/gmail.png" width="15px" height="15px" alt="..."/> &nbsp; E-Mail - info@gatesit.ac.in</h4>
     <h4>&nbsp;&nbsp; <img src="./assets/phone.png"width="20px" height="20px" alt="..."/> &nbsp;Office - +91 9949379691, +91 9491119696,<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;+91 9490082001</h4>
      </div>
    <div className="Textwidget" id="d5">
    <div className="videogal">Professional Bodies & Association</div>
    <img src="./assets/APSSDC-logo.png" width="200px" height="80px" alt="..."/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="./assets/APITA-logo.png" width="200px" height="80px" alt="..."/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <img src="./assets/ibm.png" width="150px" height="80px" alt="..."/><img src="./assets/iete.png" width="100px" height="90px" alt="..."/>&nbsp;&nbsp;&nbsp;&nbsp;<img src="./assets/iso.png" width="100px"height="90px" alt="..."/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="./assets/iucee.png"width="150px" height="90px" alt="..."/> 
    </div>
    <div className="gates" id="d6">
      <h3><b>welcome to GATES</b></h3>
      <img src="./assets/place.jpg" width="387px" height="140px" id="d7" alt="..."/>
      <br/>
    <a href="https://gatesit.ac.in/"><button id="b1">Clickhere</button></a>
    <div className="thiru">
      <h4>more information</h4>
    </div>
      </div>
    </div>
    )
}