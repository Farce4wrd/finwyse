import './App.css';
import {BrowserRouter} from "react-router-dom";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Route path={'/'} element={<Layout/>} />
          <Route index element={<Home/>} />
      </BrowserRouter>
    </div>
  );
}

export default App;
