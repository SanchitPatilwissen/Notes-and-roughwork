import { Provider } from 'react-redux';
import './App.css';
import BookContainer from "./Components/BookContainer";
import { store } from "./reduxContainer/Store";

function App() {
  return (
    <div className="App">
      <h1>React Redux Demo</h1>
      <hr></hr>
      <Provider store={store}>
        <BookContainer />
      </Provider>
    </div>
  );
}

export default App;
