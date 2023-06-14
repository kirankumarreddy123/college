import React from 'react';
import './Admin.css';
export function Admin() {
    return (
        <div className='class'>

<div class="logo" >
        <img src="https://gatesit.ac.in/wp-content/uploads/2022/09/Gates-Institute-logo.png"/>
    </div>
    <br/>
    <h1 >Welcome to our portal...!</h1>
     {/* <div class="new" > <label for="department">Department : </label>
    <select name="department" id="department">
        <option value="">Select</option>
        <option value="1">Principal</option>
        <option value="2">Management Engineer</option>
        <option value="3">Accountant</option>
    </select>
</div> */}
    <div>
        <textarea name="complaints" id="Complaints" cols="100" rows="20" ></textarea>
    </div>
    <button type="submit" id='l1' >Confirmation</button>

          </div>

    )
}