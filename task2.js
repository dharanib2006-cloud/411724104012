const loadBtn = document.getElementById("loadBtn");
const statusText = document.getElementById("status");
const usersContainer = document.getElementById("users");

loadBtn.addEventListener("click", () => {

    statusText.innerText = "Loading...";

    usersContainer.innerHTML = "";

    setTimeout(() => {

        fetch("https://jsonplaceholder.typicode.com/users")

        .then(response => response.json())

        .then(data => {

            statusText.innerText = "Loaded Successfully";

            data.forEach(user => {

                usersContainer.innerHTML += `
                    <div class="user-card">
                        <h3>${user.name}</h3>
                        <p><strong>Email:</strong> ${user.email}</p>
                        <p><strong>Phone:</strong> ${user.phone}</p>
                    </div>
                `;
            });

        })

        .catch(error => {

            statusText.innerText = "Error Loading Data";
            console.log(error);

        });

    }, 2000);

});