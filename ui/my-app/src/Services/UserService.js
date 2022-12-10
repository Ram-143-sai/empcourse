import axios  from 'axios';

const userUrl='http://localhost:8081';

// export const loginUser= async(user)=>{
        
//     return await 
     
// }
class UserService {

 

    getProducts(){
        return axios.get(userUrl+'/admin/courses');
    }
    
    addProduct(product){
        return axios.post(userUrl +'/admin/addProduct' , product);
    }
    getAvailableCoursesForEmp(id){
        return axios.get(`http://localhost:8081/availableCourses/${id}`);
    }
    getEnrolledCoursesForEmp(id){
        return axios.get(`http://localhost:8081/enrolledCourses/${id}`);
    }

}



export default new UserService();