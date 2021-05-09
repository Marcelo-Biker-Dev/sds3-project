import img_CHAMBERTRAN from "assets/img/Logo_CHAMBERTRAN.png"
import { Link } from "react-router-dom";

function NavBar() {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-1 px-md-4 mb-3 bg-0 border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <Link to="/">
                        <img src={img_CHAMBERTRAN} alt="Chambertran" width="500" />
                    </Link>
                </nav>
            </div>
        </div>
    );
}

export default NavBar;