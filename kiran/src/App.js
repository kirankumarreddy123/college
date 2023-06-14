// import logo from './logo.svg';
import './App.css';
import { Login } from './components/Login';
import { Front } from './components/Front';
import { Registration } from './components/Registration';
import { Route,Routes } from 'react-router-dom';
import { Message } from './components/Message';
import { Grievance } from './components/Grievance';
import { Admin } from './components/Admin';

function App() {
  return (
    <div className="App">
      {/* <Front/>
       <Login/>
       <Forgot/>
      <Registration/>
      <Message/> 
      <Admin/> */}
      <Routes>
        <Route path='/message' element={<Message/>}/>
        <Route path='login' element={<Login/>}/>
        <Route path='/' element={<Front/>}></Route>
        <Route path='register' element={<Registration/>}></Route>
        <Route path='/grievance' element={<Grievance/>}></Route>
        <Route path='/admin'element={<Admin/>}></Route>
        <Route></Route>
        <Route></Route>
        <Route></Route>
      </Routes>
    </div>
  );
}

export default App;
