package Algorithm;

import java.util.*;

public class BFSDemo {

    public static void bfs(Map<String, List<String>> graph, String start) {

        // ==========================================================
        // Step 2: Create the Waiting Line
        // "Who Should I Explore Next?"
        //
        // BFS uses a queue to store discovered nodes that are waiting
        // to be explored. The queue follows FIFO (First In, First Out),
        // ensuring nodes are processed in the same order they are found.
        // ==========================================================

        Queue<String> queue = new LinkedList<>();


        // ==========================================================
        // Step 3: Choose the Starting Point
        // "Where Does My Search Begin?"
        //
        // Every BFS search starts from one node. We add the starting
        // node to the queue because it is the first node to explore.
        // ==========================================================


        queue.offer(start);


        // ==========================================================
        // Create the Visited Set
        //
        // The visited set remembers every discovered node so that
        // BFS does not process the same node more than once.
        // ==========================================================
        Set<String> visited = new HashSet<>();
        visited.add(start);


        // ==========================================================
        // Step 4: Keep Searching While There Are Possibilities
        // "Do I Have More Places to Explore?"
        //
        // Continue searching while the queue contains nodes waiting
        // to be explored.
        // ==========================================================


        while (!queue.isEmpty()) {



            // ======================================================
            // Step 5: Take the Closest Waiting Node
            // "Explore the Oldest Discovery First"
            //
            // Remove the node at the front of the queue.
            // This is always the oldest discovered node.
            // ======================================================


            String current = queue.poll();

            System.out.println("Visiting: " + current);


            // ======================================================
            // Step 6: Expand One Level
            // "What Can I Reach From Here?"
            //
            // Look at every neighbor connected to the current node.
            // ======================================================


            for (String neighbor : graph.get(current)) {



                // ==================================================
                // Step 7: Add New Discoveries to the Frontier
                // "Remember Future Places"
                //
                // If this neighbor has not been discovered before,
                // remember it and place it in the queue.
                // ==================================================


                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);

                    queue.offer(neighbor);


                    

                    System.out.println(
                            "  Discovered: " + neighbor +
                                    " -> Added to queue"
                    );
                }
            }

            // ======================================================
            // Step 8: Process the Next Layer
            // "Move Through the Frontier"
            //
            // After finishing the current node, BFS automatically
            // moves to the next node waiting in the queue.
            // ======================================================

            // ======================================================
            // Step 9: Continue Expanding Outward
            // "Search Level by Level"
            //
            // Every iteration expands the search one layer farther
            // from the starting node.
            // ======================================================

            // ======================================================
            // Step 10: Ignore Dead Ends
            // "Only Follow New Paths"
            //
            // If a node has no unvisited neighbors, nothing is added
            // to the queue, and BFS simply continues.
            // ======================================================

            // ======================================================
            // Step 11: Discover a New Level
            // "Add Farther Nodes to the End"
            //
            // Newly discovered nodes are always added to the back
            // of the queue, ensuring all closer nodes are explored
            // first.
            // ======================================================

            System.out.println("Queue: " + queue);
            System.out.println();
        }

        // ==========================================================
        // Step 12: Finish Remaining Nodes
        // "Empty the Frontier"
        //
        // The loop continues until every discovered node has been
        // processed and the queue becomes empty.
        // ==========================================================

        // ==========================================================
        // Step 13: Complete the Search
        // "No More Places to Explore"
        //
        // When the queue is empty, there are no more reachable nodes
        // left to explore, so BFS is complete.
        // ==========================================================
        System.out.println("BFS Complete!");
    }


}