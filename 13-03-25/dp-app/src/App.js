import logo from './logo.svg';
import './App.css';
import GetEmployees from './GetEmployees';
import AddEmployees from './AddEmployees';

function App() {
  return (
    <div className="App">
      <h1>Employee Management Application</h1>
      <hr></hr>
      <GetEmployees></GetEmployees>
      <hr></hr>
      <AddEmployees></AddEmployees>
    </div>
  );
}

export default App;
