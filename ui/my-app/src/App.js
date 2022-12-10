import './App.css';
import {BrowserRouter ,Route,Routes} from 'react-router-dom';
import Home from './Components/Home';
import Courses from './Components/Courses'
import AvailableCourses from './Components/AvailableCourses'
import EnrolledCourses from './Components/RegisteredCourses'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      {
        <Routes>
        <Route path='/' exact element={<Home id={'3'}/>}></Route>
        <Route path='/availableCourses/:id' exact  element={<AvailableCourses id={'3'}/>}> </Route>
        <Route path='/enrolledCourses/:id' exact  element={<EnrolledCourses id={'3'}/>}> </Route>
        <Route path='/courses' exact  element={<Courses/>}> </Route>
        </Routes> 
      }
    
      </BrowserRouter>
    </div>
  );
}

export default App;
